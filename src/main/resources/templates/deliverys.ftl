<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Deliverys</title>
</head>
<body background="аптвапттаптаптаптаптапт.jpg">
<div>
    <table border="3" bgcolor="#a9a9a9">
        <tr>
            <th>Selling</th>
            <th>Departure</th>
            <th>Accept</th>
        </tr>
        <#list deliverys as delivery>
            <tr>
                <td>${delivery.selling}</td>
                <td>${delivery.departure}</td>
                <td>${delivery.accept}</td>
            </tr>
        </#list>
    </table>

</div>
</body>
</html>