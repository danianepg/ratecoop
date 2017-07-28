<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url var="actionEdit" value="${actionEdit}"></c:url>
<c:url var="actionDelete" value="${actionDelete}"></c:url>

<div id="page-wrapper" style="min-height: 296px;">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Usuários</h1>
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
                        	<a href="/ratecoop/user/addupdate">
                        		<button type="button" class="btn btn-primary" >Adicionar</button>
                        	</a>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>Usuário</th>
                                            <th>Tipo</th>                                            
                                            <th>Opções</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:if test="${!empty userList}">
											<c:forEach items="${userList}" var="user" varStatus="loop">
												
												<tr class="gradeA ${loop.index % 2 == 0 ? 'even' : 'odd'}" role="row">
													<td>${user.name}</td>
													<td>${user.type.description}</td>
													
													<td style="text-align: center;">
														
														<a href="${actionEdit}?id=${user.id}">
												          <span class="glyphicon glyphicon-edit"></span>
												        </a>
												        
												        <a href="${actionDelete}/${user.id} ">
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