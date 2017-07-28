<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<c:url var="action" value="${formAction}"></c:url>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">
				${title}			
			</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-12">

							<f:form action="${action}" method="post" modelAttribute="user" role="form">
								
								<input type="hidden" name="id" value="${user.id}" />
								
								<div class="row">
									<div class="col-lg-6">
										<div class="form-group">
											<label>Usuário *</label>
											<f:input path="name" cssClass="form-control" />
										</div>
									</div>
									<div class="col-lg-6">
										<div class="form-group">
											<label>&nbsp;</label>
											<f:errors path="name" cssClass="alert alert-danger"></f:errors>
										</div>
										
									</div>
								</div>

								<div class="row">
									<div class="col-lg-6">
										<div class="form-group">
											<label>Tipo:</label>
											<f:select path="type" cssClass="form-control"  >
												<c:forEach var="typeEnum" items="${types}">
												    <option value="${typeEnum}"> ${typeEnum.description} </option>
												</c:forEach>
											</f:select>
										</div>
									</div>
									<div class="col-lg-6">
										<div class="form-group">
											<label>&nbsp;</label>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-lg-12">
										<button type="submit" class="btn btn-primary">Confirmar</button>
										<a href="/ratecoop/user/list">
											<button type="button" class="btn btn-default">Voltar</button>
										</a>
										
									</div>
								</div>
							</f:form>

						</div>
						<!-- /.col-lg-6 (nested) -->
					</div>
					<!-- /.row (nested) -->
				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
</div>
<!-- /#page-wrapper -->
