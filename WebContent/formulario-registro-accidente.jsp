<jsp:include page='template/header.jsp'>
<jsp:param name='title' value='Formulario Registro de Accidente' />
<jsp:param name='description' value='Aca se registra formulario' />
</jsp:include>

<div class="fondo-registro-accidente">
	<div class="container py-5">
		<div class="row">
			<div class="col-12">
				<div class="card text-white bg-info mb-3">
					<div class="card-header">Formulario Registro de Accidente</div>
					<div class="card-body">
						<form action="RegistroAccidentes" method="post">
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
									<label for="razonSocial">Razón Social</label> <input type="text"
										class="form-control" id="razonSocial" name="razonSocial"
										placeholder="Ingrese Razón Social">
								</div>
								<div class="col-md-4">
									<label for="rutEmpresa">Rut Empresa</label> <input type="text"
										class="form-control" id="rutEmpresa" name="rutEmpresa"
										placeholder="Ingrese Rut Empresa">
								</div>
							</div>
							<hr>
							
									
							
							<div class="form-group row">
								<div class="col-md-6">
								<label for="fechaAccidente">Ingrese Fecha de
										Accidente</label> <input type="date" class="form-control"
										id="fechaAccidente" name="fechaAccidente"
										placeholder="Ingrese Fecha Accidente">

								</div>
								<div class="col-md-6">
								<label for="nivelAccidente">Nivel de Accidente</label> <input type="text"
										class="form-control" id="nivelAccidente" name="nivelAccidente"
										placeholder="Ingrese la gravedad del accidente">
								</div>
							</div>
							<div class="form-group row ">

								<div class="col-md-4">
									<label for="nombreAccidentado">Nombre Accidentado</label> <input type="text"
										class="form-control" id="nombreAc" name="nombreAccidentado"
										placeholder="Ingrese Nombre">
								</div>
								<div class="col-md-4">
									<label for="apellidoPac">Apellido Paterno Accidentado</label> <input
										type="text" class="form-control" id="apellidoPac"
										name="apellidoPac" placeholder="Ingrese Apellido Paterno">
								</div>
								<div class="col-md-4">
									<label for="apellidoMac">Apellido Materno Accidentado</label> <input
										type="text" class="form-control" id="apellidoMac"
										name="apellidoMac" placeholder="Ingrese Apellido Materno">
								</div>
							</div>
							<div class="form-group">
								<label for="obsAc">Observaciones</label>
								<textarea class="form-control" id="obsAc" name="obsAc"
									rows="3" placeholder="Defina el accidente"></textarea>
							</div>
							<div>
							<a href="/MiServlet/Home" class="btn btn-primary">Volver al home</a>
							<button type="submit" class="btn btn-danger float-right">Guardar</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
<%@ include file="template/footer.jsp"%>
