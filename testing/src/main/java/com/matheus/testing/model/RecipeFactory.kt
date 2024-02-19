package com.matheus.testing.model

import com.matheus.core.domain.model.Recipe
class RecipeFactory {
    fun create(recipe: Recipe) = when (recipe) {
        Recipe.BakedPotatoSnack -> Recipe(
            "Baked Potato Snack",
"https://edamam-product-images.s3.amazonaws.com/web-img/c03/c03870c0284bdb80902ce95f24187714.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEDMaCXVzLWVhc3QtMSJHMEUCIQDeO85JJEAgnotJl435izp49RfTA0vQdj2acNDCmGLF1wIgK7MiImQFVWzp44NTbCzFvD5ge5ULIv%2FTBqP%2BZXfEJfQquQUIHBAAGgwxODcwMTcxNTA5ODYiDLpPcPWKLThY1jvoWSqWBcV%2F0kcF3MWOSi%2Bj2m7B6eWJ1%2Fnpghjs296YVIjTy6QzxD2iAYDVMrP2VchEr8BaKNQ2OumR4rjRI3pqe8mWj3111zJKf5lIOLNmensfPWpaniTtBeSmcIpTOrJBNEUZV4NnUNLIOjdC6pAqBMdtyig2NLe6vV35IyVJE03GR7TKlmIhUxN4pdTuc%2F%2B9v5o1uH39FFvXuJYTkP1kELC2q94NesSEHbJxMb6HLkBMTCmGiar%2BY4okD2Ei9DMlE%2BBlhflU8i8GFw1PpRcCYlbhmiMRTdN3DCsF%2FGxz33Sjg7%2B9fLIO2o8tkSP52xXIX2aSGNJNT2f9RJ6lqPL8nOXp1l4%2FQDnAN5hI5XO1QSYzG36r5Nl80xiiJcB8KfzrbelWyI%2B%2F%2BAyMKImJgYOGPbA7a4ZAUU5lxVkdI6B2mXzStqhdNCksMlkvJOsbQiTPJV1Yw%2FHdrAb9Hi5s9JKnV%2BvO94pS3fjCweMX3r7KrwluINijO3rkkGDgWPEssj%2FGbZrs6SK5C%2Fiptw%2BDWviENG%2F8uEJcGDRZ34e12xZ48FEhiwt%2BUdQqEvCyrPWUgNpAy0NU8XY5SAMUq81fqYgIPqaBkibbGMNIERo0%2BvWUGR8Wsxa4exHKhZnT3mkDX%2FRWTf7LKIF8wyrT1aZK9flx%2FX9GKJ1AjiomyBwKLBRw%2FgDDT9wLo71C49eFq7SC15c0hwDv58vl%2F7URZWE7KsjzsqLheQ8PzwzGqg06A%2BP6WHZzTlu0zln9cd1zizdbW%2FG9vytf1Jev3sqRKD8b%2BFUR5ID%2BrmSvqVva7BWGH61TufDqMTSq4fKaC%2FYx7r0bWKf8A0wVd5eYgJ46FidifcZIDbrDezVIp1v%2FtUsM9irqLPUfhmT28YOJzEP5MKDCzq4GOrEBsk%2FcIRACMGlncZDMjEhvrZ8iUivO7AmygEo3DsilOjk63uzGAVPYcav3VV3oZMWGV9b2zni1oPlPPhODjZG9lvbC8pIBNZSeh3ekelTPulMshNZyp1JpRJ4N3ZlrooDUn0WTXiB9R5qwS6UzDIF7kmg9OLg9TYI7WmlbA8k0h46bAJW0Kw9uQHi7%2FXdIxRdzMthjYSXMjxUlPIMry6Puq7%2B0Kmb3NTcNMNvgdaWOigZq&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20240219T200520Z&X-Amz-SignedHeaders=host&X-Amz-Expires=3600&X-Amz-Credential=ASIASXCYXIIFJNZ2ABI6%2F20240219%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=cce0c638b167c9bdc4c12f52b27e1c986c7b092671bc31b318430693b46e9736",
            "0",
            "0"
        )
        Recipe.SweetPotatoCrisps -> Recipe(
            "Sweet potato crisps",
"https://edamam-product-images.s3.amazonaws.com/web-img/680/680525794659eec4b5ba4ad54ef10cc5.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEDMaCXVzLWVhc3QtMSJHMEUCIQDeO85JJEAgnotJl435izp49RfTA0vQdj2acNDCmGLF1wIgK7MiImQFVWzp44NTbCzFvD5ge5ULIv%2FTBqP%2BZXfEJfQquQUIHBAAGgwxODcwMTcxNTA5ODYiDLpPcPWKLThY1jvoWSqWBcV%2F0kcF3MWOSi%2Bj2m7B6eWJ1%2Fnpghjs296YVIjTy6QzxD2iAYDVMrP2VchEr8BaKNQ2OumR4rjRI3pqe8mWj3111zJKf5lIOLNmensfPWpaniTtBeSmcIpTOrJBNEUZV4NnUNLIOjdC6pAqBMdtyig2NLe6vV35IyVJE03GR7TKlmIhUxN4pdTuc%2F%2B9v5o1uH39FFvXuJYTkP1kELC2q94NesSEHbJxMb6HLkBMTCmGiar%2BY4okD2Ei9DMlE%2BBlhflU8i8GFw1PpRcCYlbhmiMRTdN3DCsF%2FGxz33Sjg7%2B9fLIO2o8tkSP52xXIX2aSGNJNT2f9RJ6lqPL8nOXp1l4%2FQDnAN5hI5XO1QSYzG36r5Nl80xiiJcB8KfzrbelWyI%2B%2F%2BAyMKImJgYOGPbA7a4ZAUU5lxVkdI6B2mXzStqhdNCksMlkvJOsbQiTPJV1Yw%2FHdrAb9Hi5s9JKnV%2BvO94pS3fjCweMX3r7KrwluINijO3rkkGDgWPEssj%2FGbZrs6SK5C%2Fiptw%2BDWviENG%2F8uEJcGDRZ34e12xZ48FEhiwt%2BUdQqEvCyrPWUgNpAy0NU8XY5SAMUq81fqYgIPqaBkibbGMNIERo0%2BvWUGR8Wsxa4exHKhZnT3mkDX%2FRWTf7LKIF8wyrT1aZK9flx%2FX9GKJ1AjiomyBwKLBRw%2FgDDT9wLo71C49eFq7SC15c0hwDv58vl%2F7URZWE7KsjzsqLheQ8PzwzGqg06A%2BP6WHZzTlu0zln9cd1zizdbW%2FG9vytf1Jev3sqRKD8b%2BFUR5ID%2BrmSvqVva7BWGH61TufDqMTSq4fKaC%2FYx7r0bWKf8A0wVd5eYgJ46FidifcZIDbrDezVIp1v%2FtUsM9irqLPUfhmT28YOJzEP5MKDCzq4GOrEBsk%2FcIRACMGlncZDMjEhvrZ8iUivO7AmygEo3DsilOjk63uzGAVPYcav3VV3oZMWGV9b2zni1oPlPPhODjZG9lvbC8pIBNZSeh3ekelTPulMshNZyp1JpRJ4N3ZlrooDUn0WTXiB9R5qwS6UzDIF7kmg9OLg9TYI7WmlbA8k0h46bAJW0Kw9uQHi7%2FXdIxRdzMthjYSXMjxUlPIMry6Puq7%2B0Kmb3NTcNMNvgdaWOigZq&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20240219T200720Z&X-Amz-SignedHeaders=host&X-Amz-Expires=3600&X-Amz-Credential=ASIASXCYXIIFJNZ2ABI6%2F20240219%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=3bd81e987e321e718bd302fd318747a14d4274c20d0d1cd964cd4c3bec49a5cd"    ,
            "0",
            "0"
        )
    }

    sealed class Recipe {
        object BakedPotatoSnack : Recipe()
        object SweetPotatoCrisps : Recipe()
    }
}