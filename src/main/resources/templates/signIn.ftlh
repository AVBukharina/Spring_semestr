<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/css/signUpAndIn.css">
    <link href="https://fonts.googleapis.com/css2?family=Kaushan+Script&family=Montserrat:ital,wght@0,400;0,700;1,300&display=swap"
          rel="stylesheet">
    <script src="https://kit.fontawesome.com/c02ef43b18.js" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.js"
            integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
            crossorigin="anonymous"></script>
</head>
<body>
<div class="sign-block">
    <div class="sign">
        <h5 class="sign-head">Вход</h5>
        <form action="/signIn" method="post">
            <div class="input-data">
                <input type="email" name="email" placeholder="Введите Email">
            </div>
            <div class="input-data">
                <input type="password" name="password" placeholder="Введите пароль">
            </div>
            <div class="input-btn">
                <input type="submit" value="Войти">
            </div>
        </form>

        <hr class="hr">

        <p class="notReg">Еще не зарегистрированы?</p>
        <div class="input-btn notReg-btn">
            <a href="/signUp">
                <input type="submit" value="Зарегистироваться">
            </a>
        </div>
    </div>
</div>

</body>
</html>