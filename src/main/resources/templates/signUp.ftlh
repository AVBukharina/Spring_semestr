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

<div class="registration">
    <div class="reg">
        <h5 class="reg-head">Регистрация</h5>
        <form action="/signUp" method="post">
            <div class="input-data">
                <input type="email" name="email" placeholder="Введите Email">
            </div>
            <div class="input-data">
                <input type="password" name="hashpassword" placeholder="Введите пароль">
            </div>
            <div class="input-data">
                <input type="text" name="phone" placeholder="Введите телефон">
            </div>
            <div class="input-data">
                <input type="text" name="firstname" placeholder="Введите Имя">
            </div>
            <div class="input-data">
                <input type="text" name="lastname" placeholder="Введите Фамилию">
            </div>
            <div class="input-btn">
                <input type="submit" value="Зарегистрироваться">
            </div>
        </form>

        <hr class="hr">

        <p class="notSign">Уже зарегестрированы?</p>
        <div class="input-btn notSign-btn">
            <a href="/signIn">
                <input type="submit" value="Войти">
            </a>
        </div>
    </div>
</div>
</body>
</html>