<jsp:include page='template/header.jsp'>
<jsp:param name='title' value='Formulario Registro de Accidente' />
<jsp:param name='description' value='Aca se registra formulario' />
</jsp:include>
	<div class="container py-5">
		<div class="row">
			<div class="col-12">
				<div class="card text-white bg-info mb-3">
					<div class="card-header">Formulario Registro de Accidente</div>
					<div class="card-body">
						<form action="procesar.jsp" method="post">
						<div class="row">
								<div class="col-12 font-weight-bold">
									<p>Datos Empresa:</p>
								</div>
							</div>
							<div class="form-group row pb-3">
								<div class="col-md-4">
									<label for="nombre">Nombre Empresa</label> <input type="text"
										class="form-control" id="nombreEmpresa" name="nombreEmpresa"
										placeholder="Ingrese Nombre Empresa">
								</div>
								<div class="col-md-4">
									<label for="apellidoP">Razón Social</label> <input type="text"
										class="form-control" id="razonSocial" name="razonSocial"
										placeholder="Ingrese Razón Social">
								</div>
								<div class="col-md-4">
									<label for="apellidoM">Rut Empresa</label> <input type="text"
										class="form-control" id="rutEmpresa" name="rutEmpresa"
										placeholder="Ingrese Rut Empresa">
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
									<label for="nombre">Nombre</label> <input type="text"
										class="form-control" id="nombre" name="nombre"
										placeholder="Ingrese Nombre">
								</div>
								<div class="col-md-4">
									<label for="apellidoP">Apellido Paterno</label> <input
										type="text" class="form-control" id="apellidoP"
										name="apellidoP" placeholder="Ingrese Apellido Paterno">
								</div>
								<div class="col-md-4">
									<label for="apellidoM">Apellido Materno</label> <input
										type="text" class="form-control" id="apellidoM"
										name="apellidoM" placeholder="Ingrese Apellido Materno">
								</div>
							</div>
							
							<div class="form-group row pb-3">
								<div class="col-md-6">
									<label for="exampleFormControlInput1">Teléfono</label> <input
										type="text" class="form-control" id="telefono" name="telefono"
										placeholder="Ingrese Teléfono">
								</div>
								<div class="col-md-6">
									<label for="exampleFormControlInput1">Correo</label> <input
										type="email" class="form-control" id="correo" name="correo"
										placeholder="Ingrese Correo">
								</div>
							</div>
							<hr>
							<div class="form-group row">
								<div class="col-md-6">
									<label for="exampleFormControlSelect1">Ingrese Fecha de
										Accidente</label> <input type="date" class="form-control"
										id="fechaAccidente" name="fechaAccidente"
										placeholder="Ingrese Fecha Accidente">
								</div>
								<div class="col-md-6">
								<label for="exampleFormControlSelect1">Nivel de Accidente</label> <select class="form-control"
									id="exampleFormControlSelect1">
									<option selected value="">Seleccione Nivel	</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
								</select>
								</div>
							</div>
							<div class="form-group row ">

								<div class="col-md-4">
									<label for="nombre">Nombre Accidentado</label> <input type="text"
										class="form-control" id="nombreAc" name="nombreAc"
										placeholder="Ingrese Nombre">
								</div>
								<div class="col-md-4">
									<label for="apellidoP">Apellido Paterno Accidentado</label> <input
										type="text" class="form-control" id="apellidoPAc"
										name="apellidoPAc" placeholder="Ingrese Apellido Paterno">
								</div>
								<div class="col-md-4">
									<label for="apellidoM">Apellido Materno Accidentado</label> <input
										type="text" class="form-control" id="apellidoMAc"
										name="apellidoMAc" placeholder="Ingrese Apellido Materno">
								</div>
							</div>
							<div class="form-group">
								<label for="exampleFormControlTextarea1">Observaciones</label>
								<textarea class="form-control" id="observacion" name="observacion"
									rows="3" placeholder="Defina el accidente"></textarea>
							</div>
							<div>
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
