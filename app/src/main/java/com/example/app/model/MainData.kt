package com.example.app.model

data class MainData(
    val id: Int,
    val recipe: String,
    val date: String
)

val dummydata = listOf<MainData>(
    MainData(1, "Resep Endog Bakar", "12-12-04"),
    MainData(2, "Jurnal", "12-4-27"),
    MainData(3, "Tugas", "8-3-09"),
)
