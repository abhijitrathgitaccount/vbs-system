<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<h2>Login</h2>

<form action="/users/login" method="post">
    Email: <input type="text" name="email" required/><br><br>
    Password: <input type="password" name="password" required/><br><br>
    <button type="submit">Login</button>
</form>

<p style="color:red">${error}</p>

<a href="/users/register">Register here</a>