<jsp:include page='template/header.jsp'>
<jsp:param name='title' value='Home' />
<jsp:param name='description' value='Home' />
</jsp:include>
<body>
	<div class="container-fluid">
		<div class="card">
		  <div class="card-header">
		    Home
		  </div>
		  <div class="row">
			  <div class="col-sm-6">
			    <div class="card">
			      <div class="card-body">
			        <h5 class="card-title">Gestión de Clientes</h5>
			        <p class="card-text">Agregar, Asociar trabajadores, etc.</p>
			        <a href="Clientes" class="btn btn-primary">Clientes</a>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-6">
			    <div class="card">
			      <div class="card-body">
			        <h5 class="card-title">Special title treatment</h5>
			        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
			        <a href="#" class="btn btn-primary">Go somewhere</a>
			      </div>
			    </div>
			  </div>
			</div>
		</div>
	
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>
<%@ include file="template/footer.jsp"%>