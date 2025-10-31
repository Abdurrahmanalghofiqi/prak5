package com.example.prak5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@Composable

fun FromDataDiri(modifier: Modifier)
({
    //Variabel-Variabel untuk mengingat nilai masukan dari keyboard

    var textName by remember { mutableStateOf( value: "") }
    var textAlamat by remember { mutableStateOf( value: "") }
    var textJK by remember { mutableStateOf( value: "") }
    //Variabel-Variabel untuk menyimpan data yang diperoleh dari komponen ui

    var nama by remember { mutableStateOf( value: "") }
    var alamat by remember { mutableStateOf( value: "") }
    var jenis by remember { mutableStateOf( value: "") }

    val gender:List<String> = listOf("Laki-Laki", "Perempuan")
})