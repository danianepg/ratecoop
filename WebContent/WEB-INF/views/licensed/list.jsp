<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url var="actionEdit" value="${actionEdit}"></c:url>
<c:url var="actionDelete" value="${actionDelete}"></c:url>

<div id="page-wrapper" style="min-height: 296px;">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Cooperados</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="row">
				<div class="col-sm-12">
				
					<div class="panel panel-default">
                        <div class="panel-heading">
                        	<a href="/ratecoop/licensed/addupdate">
                        		<button type="button" class="btn btn-primary" >Adicionar</button>
                        	</a>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>Nome</th>
                                            <th>Tipo</th>
                                            <th>Endereço</th>
                                            <th>Telefone</th>
                                            <th>Especialidade</th>
                                            <th>Nota</th>
                                            <th>Opções</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:if test="${!empty licensedList}">
											<c:forEach items="${licensedList}" var="licensed" varStatus="loop">
												
												<tr class="gradeA ${loop.index % 2 == 0 ? 'even' : 'odd'}" role="row">
													<td>${licensed.name}</td>
													<td>${licensed.type}</td>
													<td>${licensed.address}</td>
													<td>${licensed.phone}</td>
													<td>${licensed.speciality}</td>
													<td>${licensed.rate}</td>
													<td style="text-align: center;">
														
														<a href="${actionEdit}?id=${licensed.id}">
												          <span class="glyphicon glyphicon-edit"></span>
												        </a>
												        
												        <a href="${actionDelete}/${licensed.id} ">
												          <span class="glyphicon glyphicon-trash"></span>
												        </a>
												        
													</td>
												</tr>
												
											</c:forEach>
										</c:if>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
					
				</div>
			</div>
			
			
			<!-- end row -->
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
</div>