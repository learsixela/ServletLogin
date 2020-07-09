<jsp:include page='template/header.jsp'>
<jsp:param name='title' value='Formulario Registro Cliente' />
<jsp:param name='description' value='Aca se registra formulario' />
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
						<form action="RegistroClientes" method="POST">
						<div class="row">
								<div class="col-12 font-weight-bold">
									<p>Datos Empresa:</p>
								</div>
							</div>
							<div class="form-group row pb-3">
								<div class="col-md-4">
									<label for="nombreEmpresa">Nombre Empresa</label> <input type="text"
										class="form-control" id="nombreEmpresa" name="nombreEmpresa"
										placeholder="Ingrese Nombre Empresa">
								</div>
							
								<div class="col-md-4">
									<label for="rutEmpresa">Rut Empresa</label> <input type="text"
										class="form-control" id="rutEmpresa" name="rutEmpresa"
										placeholder="Ingrese Rut Empresa">
								</div>
								
									<div class="col-md-4">
									<label for="giroEmpresa">Giro Empresa</label> <input type="text"
										class="form-control" id="giroEmpresa" name="giroEmpresa"
										placeholder="Ingrese Giro Empresa">
								</div>
							</div>
							<hr>
							<div class="row">
								<div class="col-12 font-weight-bold">
									<p>Datos Contacto:</p>
								</div>
							</div>
							<div class="form-group row ">

								<div class="col-md-4">
									<label for="nombreContacto">Nombre Contacto</label> <input type="text"
										class="form-control" id="nombreContacto" name="nombreContacto"
										placeholder="Ingrese Nombre">
								</div>
								<div class="col-md-4">
									<label for="telefono">Telefono</label> <input
										type="text" class="form-control" id="telefono"
										name="telefono" placeholder="Ingrese Telefono">
								</div>
								<div class="col-md-4">
									<label for="correo">Correo Electronico</label> <input
										type="email" class="form-control" id="correo"
										name="correo" placeholder="Ingrese Correo">
								</div>
							</div>
							
							<div class="form-group row pb-3">
								<div class="col-md-4">
									
									<label for="region">Región</label> <input
										type="text" class="form-control" id="region" name="region"
										placeholder="Ingrese Región">
								</div>
								<div class="col-md-4">
									<label for="ciudad">Ciudad</label> <input
										type="text" class="form-control" id="ciudad" name="ciudad"
										placeholder="Ingrese Ciudad">
								</div>
								
								<div class="col-md-4">
									<label for="direccion">Dirección</label> <input
										type="text" class="form-control" id="direccion" name="direccion"
										placeholder="Ingrese Dirección">
								</div>
							</div>
							<hr>
							<a href="/MiServlet/Home" class="btn btn-primary">Volver al home</a>
							<button type="submit" class="btn btn-danger float-right">Registrar Cliente</button>
							</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>

	
<%@ include file="template/footer.jsp"%>
