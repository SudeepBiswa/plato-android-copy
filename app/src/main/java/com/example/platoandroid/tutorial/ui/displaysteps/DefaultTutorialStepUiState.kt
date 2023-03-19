package com.example.platoandroid.tutorial.ui.displaysteps

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.platoandroid.data.model.TutorialStepUiState
import com.example.platoandroid.data.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard

class DefaultTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "PLATO Android",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.subtitle2
      )
      Text(
        text = "An interactive on Android development learning experience."
      )
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = emptyList()
}