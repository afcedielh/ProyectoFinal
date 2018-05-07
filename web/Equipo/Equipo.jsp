<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>
    <f:view>

        <h:form id="formaArticulos">
            <center>

                <table>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;" align="right">Id equipo : </td>
                        <td><h:inputText value="#{equipoBean.id}"/></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;" align="right">Nombre : </td>
                        <td><h:inputText value="#{equipoBean.nombre}"/></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;" align="right">capital : </td>
                        <td><h:inputText value="#{equipoBean.capital}"/></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;" align="right">Poblacion : </td>
                        <td><h:inputText value="#{equipoBean.poblacion}"/></td>
                    </tr>

                    <tr>
                        <td colspan="2">
                    <h:commandButton value="Guardar" action="#{equipoBean.insert()}"/>
                    <h:commandButton value="Actualizar" action="#{equipoBean.update()}"/>
                    <h:commandButton value="Eliminar" action="#{equipoBean.delete()}"/>
                    </td>

                    </tr>
                </table>

                <h:dataTable id="tablaArticulos" value="#{equipoBean.lista}" var="obj"
                             border="1">

                    <h:column>
                        <f:facet name="header"><h:outputText value="Id"></h:outputText></f:facet>
                        <h:outputText value="#{obj.id}"></h:outputText>
                    </h:column>

                    <h:column>
                        <f:facet name="header"><h:outputText value="Nombre"></h:outputText></f:facet>
                        <h:outputText value="#{obj.nombre}"/>
                    </h:column>

                    <h:column>
                        <f:facet name="header"><h:outputText value="poblacion"></h:outputText></f:facet>
                        <h:outputText value="#{obj.poblacion}"/>
                    </h:column>

                    <h:column>
                        <f:facet name="header"><h:outputText value="capital"></h:outputText></f:facet>
                        <h:outputText value="#{obj.capital}"/>
                    </h:column>

                    <h:column>
                        <f:facet name="header"><h:outputText value="Nombre"></h:outputText></f:facet>
                        <h:outputText value="#{obj.nombre}"/>
                    </h:column>

                </h:dataTable>

            </center>

        </h:form>

    </f:view>
</body>
</html>
