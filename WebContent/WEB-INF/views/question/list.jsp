<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url var="actionEdit" value="${actionEdit}"></c:url>
<c:url var="actionDelete" value="${actionDelete}"></c:url>

<div id="page-wrapper" style="min-height: 296px;">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Perguntas de Avaliação</h1>
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
                        	<a href="/ratecoop/question/addupdate">
                        		<button type="button" class="btn btn-primary" >Adicionar</button>
                        	</a>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>Pergunta</th>
                                            <th>Peso</th>                                            
                                            <th>Opções</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:if test="${!empty questionList}">
											<c:forEach items="${questionList}" var="question" varStatus="loop">
												
												<tr class="gradeA ${loop.index % 2 == 0 ? 'even' : 'odd'}" role="row">
													<td>${question.name}</td>
													<td>${question.value}</td>
													
													<td style="text-align: center;">
														
														<a href="${actionEdit}?id=${question.id}">
												          <span class="glyphicon glyphicon-edit"></span>
												        </a>
												        
												        <a href="${actionDelete}/${question.id} ">
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