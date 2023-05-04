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
<body background="аптвапттаптаптаптаптапт.jpg">
<div>
    <table border="3" bgcolor="#a9a9a9">
        <tr>
            <th>Name</th>
            <th>Price</th>
            <th>Unit</th>
            <th>Available</th>
        </tr>
        <#list products as product>
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.unit}</td>
                <td>${product.available}</td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>