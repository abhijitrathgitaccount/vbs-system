<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<h2>All Breakdown Requests</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Vehicle</th>
        <th>Location</th>
        <th>Issue</th>
        <th>Status</th>
        <th>Action</th>
    </tr>

    <c:forEach var="req" items="${requests}">
        <tr>
            <td>${req.id}</td>
            <td>${req.vehicleNumber}</td>
            <td>${req.location}</td>
            <td>${req.issue}</td>
            <td>${req.status}</td>
            <td>
                <a href="/requests/complete/${req.id}">Mark Completed</a>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="/users/dashboard">Back</a>