<jsp:include page='template/header.jsp'>
<jsp:param name='title' value='Formulario Registro Colaborador' />
<jsp:param name='description' value='Formulario Registro Colaborador' />
</jsp:include>

<div class="fondo-registro-cliente"> 
	<div class="container py-5">
		<div class="row">
			<div class="col-12">
				<div class="card text-white bg-secondary mb-3">
					<c:if test="${not empty mensaje}">
						<div class="alert alert-info">${mensaje.getsMensaje()}</div>
					</c:if>
					<div class="card-header">Formulario Registro de Cliente</div>
					<div class="card-body">
						<form action="Trabajadores" method="POST">
						<div class="row">
								<div class="col-12 font-weight-bold">
									<p>Datos Empresa:</p>
								</div>
							</div>
							<div class="form-group row pb-3">
								<div class="col-md-3">
									<label for="nombre">Nombre Trabajador</label> <input type="text"
										class="form-control" id="nombre" name="nombre"
										placeholder="Ingrese Nombre Trabajador">
								</div>
							
								<div class="col-md-3">
									<label for="rut">Rut Trabajador</label> <input type="text"
										class="form-control" id="rut" name="rut"
										placeholder="Ingrese Rut Trabajador">
								</div>
								
									<div class="col-md-3">
									<label for="email">Ingresar Email</label> <input type="text"
										class="form-control" id="email" name="email"
										placeholder="Ingrese email">
								</div>
								<div class="col-md-3">
									<label for="empresa">Seleccione Empresa</label> <input type="text"
										class="form-control" id="empresa" name="empresa"
										placeholder="Ingrese Empresa">
								</div>
							</div>
							<hr>
					
							<a href="/MiServlet/Home" class="btn btn-primary">Volver al home</a>
							<button type="submit" class="btn btn-danger float-right">Registrar Trabajador</button>
							</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>

	
<%@ include file="template/footer.jsp"%>
