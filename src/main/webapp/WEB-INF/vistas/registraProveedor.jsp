<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="esS" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.js"></script>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/bootstrapValidator.css"/>

<title>Registra Proveedor</title>
</head>
<body>

<div class="container">
<h1>Registra Proveedor</h1>

	<c:if test="${sessionScope.MENSAJE != null}">
		<div class="alert alert-success fade in" id="success-alert">
		 <a href="#" class="close" data-dismiss="alert">&times;</a>
		 <strong>${sessionScope.MENSAJE}</strong>
		</div>
	</c:if>
	<c:remove var="MENSAJE" />

	<form action="registraProveedor" id="id_form" method="post"> 
			<input type="hidden" name="metodo" value="registra">	
			<div class="form-group">
				<label class="control-label" for="id_raz_social_proveedor">Razón social Proveedor</label>
				<input class="form-control" type="text" id="id_raz_social_proveedor" name="rSocial" placeholder="Ingrese la Razon social">
			</div>
			<div class="form-group">
				<label class="control-label" for="id_dir_proveedor">Direccion Proveedor</label>
				<input class="form-control" id="id_dir_proveedor" name="dirProveedor" placeholder="Ingrese la direccion del proveedor" type="text" />
			</div>
			<div class="form-group">
				<label class="control-label" for="id_ruc_proveedor">Ruc Proveedor</label>
				<input class="form-control" id="id_ruc_proveedor" name="rucProveedor" placeholder="Ingrese el ruc Proveedor" type="text" />
			</div>
			<div class="form-group">
				<label class="control-label" for="id_fecReg">Fecha Registro Proveedor</label>
				<input class="form-control" id="id_fecReg" name="fecReg" placeholder="Ingrese la fecha Reg" type="text" />
			</div>
			<div class="form-group">
				<label class="control-label" for="id_categoria">Categoria</label>
				<select id="id_categoria" name="categoria.cod_categoria" class='form-control'>
					<option value=" ">[Seleccione]</option>    
				</select>
		    </div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary" >Crea Proveedor</button>
			</div>
	</form>
</div>

<script type="text/javascript">
console.log("inicio");
$.getJSON("cargaCategoria", {}, function(data){
	console.log("inicio2");
	$.each(data, function(index,item){
		$("#id_categoria").append("<option value="+item.cod_categoria +">"+ item.nom_categoria +"</option>");
	});
});
</script>

<script type="text/javascript">
$("#success-alert").fadeTo(1000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});
</script>

<script type="text/javascript">

$('#id_form').bootstrapValidator({
    message: 'This value is not valid',
    feedbackIcons: {
        valid: 'glyphicon glyphicon-ok',
        invalid: 'glyphicon glyphicon-remove',
        validating: 'glyphicon glyphicon-refresh'
    },
    fields: {
    	rSocial: {
    		selector : '#id_raz_social_proveedor',
            validators: {
                notEmpty: {
                    message: 'la raz_social_proveedor es un campo obligatorio'
                },
                stringLength :{
                	message:'La id_raz_social_proveedor es de 3 a 40 caracteres',
                	min : 3,
                	max : 40
                }
            }
        },
        dirProveedor: {
    		selector : '#id_dir_proveedor',
            validators: {
                notEmpty: {
                    message: 'La direccion del proveedor es un campo obligatorio'
                },
                stringLength :{
                	message:'La idireccion del proveedor es de 3 a 40 caracteres',
                	min : 3,
                	max : 40
                }
            }
        },
        rucProveedor: {
    		selector : '#id_ruc_proveedor',
            validators: {
            	notEmpty: {
                    message: 'El ruc Proveedor es un campo obligatorio'
                },
                stringLength :{
                	message:'El ruc Proveedor es de 11 caracteres',
                	min : 11
                }
            }
        },

        deporte: {
    		selector : '#id_categoria',
            validators: {
            	notEmpty: {
                    message: 'La categoria un campo obligatorio'
                },
            }
        },
    	
    }   
});
</script>

<script type="text/javascript">
$("#success-alert").fadeTo(2000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});
</script>

</body>
</html>




