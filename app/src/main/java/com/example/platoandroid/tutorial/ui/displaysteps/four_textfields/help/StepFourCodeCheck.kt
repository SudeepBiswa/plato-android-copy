package com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StepFourCodeCheck() {
  Column {
    Text(text = "Your new variable should look like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Button(onClick = {\n" +
      "        viewModel.addTodoListItem(\n" +
      "          TodoListItem(id = Random(123).toString(), itemName = newTodoItemNameText.value.text)\n" +
      "        )\n" +
      "        newTodoItemNameText.value = TextFieldValue(\"\")\n" +
      "      }) {\n" +
      "        Text(text = \"Add Item\")\n" +
      "      }")
  }
}