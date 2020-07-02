<jsp:include page='template/header.jsp'>
<jsp:param name='title' value='Clientes' />
<jsp:param name='description' value='Clientes' />
</jsp:include>
<body>
	<div class="container-fluid">
		<div class="card">
		  <div class="card-header">
		    Clientes
		    <a href="/MiServlet/Clientes">Nuevo Cliente</a>
		  </div>
		  <div class="row">
			  <div class="col-sm-12">
			    <div class="card">
			      <div class="card-body">
			        <table class="table">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Cliente</td>
								<th scope="col">Nº Trabajadores</td>
								<th scope="col">Accion</td>
							</tr> 
						</thead>
						<tbody>
							<c:forEach var="cliente" items="${clientes}" varStatus="loop">
								<tr>
									<th scope="row"><c:out value="${loop.index}"/></th>									
									<td><c:out value="${cliente.sNombre}"/></td>
									<td><c:out value="${cliente.getArrayListPlayer().size()}"/></td>
									
									
									<td colspan="2">
										<form action="Clientes" method="GET">
											<input hidden="hidden" name= "id" value="${loop.index}">
											<button type="submit" class="btn btn-primary btn-sm">I</button>
										</form>
										<form action="DeleteTeams" method="POST">
											<input hidden="hidden" name= "idTeam" value="${loop.index}">
											<button type="submit" class="btn btn-secondary btn-sm">X</button>
										</form>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					
					</table>
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