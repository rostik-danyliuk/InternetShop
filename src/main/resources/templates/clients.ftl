<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <table border="3" bgcolor="aqua">
        <tr>
            <th>LastName</th>
            <th>FirstName</th>
            <th>Patronymic</th>
            <th>Address</th>
            <th>PhoneNumber</th>
            <th>Email</th>
            <th>RegularStatus</th>
        </tr>
        <#list clients as client>
            <tr>
                <td>${client.lastName}</td>
                <td>${client.firstName}</td>
                <td>${client.patronymic}</td>
                <td>${client.address}</td>
                <td>${client.phoneNumber}</td>
                <td>${client.EMail}</td>
                <td>${client.regular}</td>
            </tr>
        </#list>
    </table>
</body>
</html>