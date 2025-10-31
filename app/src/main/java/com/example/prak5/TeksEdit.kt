package com.example.prak5

import android.inputmethodservice.Keyboard.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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

    Column(modifier= Modifier.padding(top= 50.dp)
    verticalArrangement = Arrangement.Top,

        horizontalAligment = Alignment.Top,
        OutlinedTextField(
            value = textName,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),

            label = { Text(text = "Nama Lengkap") },

            onValueChange = {
                textName = it
            }
        )

        Row{
            gender.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = textJK == item,

                    onClick = {textJK = item}
                ))
            }
        }
    )
})