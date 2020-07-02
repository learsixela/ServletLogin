<jsp:include page='template/header.jsp'>
<jsp:param name='title' value='Formulario Registro' />
<jsp:param name='description' value='Formulario Registro' />
</jsp:include>
<body>
	<main>
		<div class="container">
			<div class="row vh-100">
				<div class="col-md-4 mx-auto d-flex align-items-center">
					<div class="card bg-light mb-3 shadow-lg">
						<div class="card-header">Registrar Usuario</div>
						<div class="card-body">
							<form action="Registro" method="GET">
								<div class="form-group">
									<label for="">Nombre:</label> 
									<input type="text" value=""
										name="nombre" id="nombre" required="required"
										class="form-control" placeholder="Ingrese Nombre"><br>
									<label for="">Rut:</label> 
									<input type="text" value=""
										name="rut" id="rut" required="required"
										class="form-control" placeholder="Ingrese Password"><br>
										<label for="">Password:</label> 
										<input type="password" value=""
										name="pass" id="pass" required="required"
										class="form-control" placeholder="Ingrese Password"><br>
									<button class="btn btn-primary float-right" type="submit">Registrarse</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
	</main>
<%@ include file="template/footer.jsp"%>