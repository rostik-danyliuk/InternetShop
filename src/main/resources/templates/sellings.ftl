<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Sellings</title>
</head>
<body background="аптвапттаптаптаптаптапт.jpg">
<div>
    <table border="3" bgcolor="#a9a9a9">
        <tr>
            <th>Client</th>
            <th>Product</th>
            <th>DateOfSale</th>
            <th>Discount</th>
        </tr>
        <#list sellings as selling>
            <tr>
                <td>${selling.client}</td>
                <td>${selling.product}</td>
                <td>${selling.dateOfSale}</td>
                <td>${selling.discount}</td>
            </tr>
        </#list>
    </table>

</div>

</body>
</html>