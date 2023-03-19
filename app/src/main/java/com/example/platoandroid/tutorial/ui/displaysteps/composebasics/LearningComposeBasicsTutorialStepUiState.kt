package com.example.platoandroid.tutorial.ui.displaysteps.composebasics

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.data.model.TutorialStepUiState
import com.example.platoandroid.data.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepEight
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepEighteen
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepEleven
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepFifteen
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepFive
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepFour
// import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepFourteen
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepNine
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepNineteen
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepOne
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepSeven
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepSix
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepSixteen
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepTen
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepThirteen
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepThree
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepTwelve
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeBasicsSubStepTwo
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.ComposeOverviewSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.CreateYourOwnComposablePartTwoSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.CreateYourOwnComposableSubStepTwoUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.CreateYourOwnComposableSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.TryAComposablePartTwoSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.TryAComposableSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps.UsingComposeDocumentationSubStepUiState

class LearningComposeBasicsTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "UI: User Interface",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(
        text = "The UI of an app is the things you see & interact with. UI elements are things like:"
      )
      Text(
        text = "Buttons",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.caption,
        modifier = Modifier.padding(start = 16.dp)
      )
      Text(
        text = "Text (THIS is a text UI element!)",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.caption,
        modifier = Modifier.padding(start = 16.dp)
      )
      Text(
        text = "Images",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.caption,
        modifier = Modifier.padding(start = 16.dp)
      )
      Text(
        text = "Background Colors",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.caption,
        modifier = Modifier.padding(start = 16.dp)
      )
      Text(
        text = "Anything you display on the screen!",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.caption,
        modifier = Modifier.padding(start = 16.dp)
      )
      Spacer(modifier = Modifier.height(8.dp))
      Button(onClick = { showNextStep() }) {
        Text(text = "Cool! How do we build UI in Android?")
      }
    }
  }

  override fun getSubSteps() : List<TutorialSubStep> = listOf(
    ComposeOverviewSubStepUiState(),
    TryAComposableSubStepUiState(),
    TryAComposablePartTwoSubStepUiState(),
    UsingComposeDocumentationSubStepUiState(),
    CreateYourOwnComposableSubStepUiState(),
    CreateYourOwnComposableSubStepTwoUiState(),
    CreateYourOwnComposablePartTwoSubStepUiState(),
    ComposeBasicsSubStepOne(),
    ComposeBasicsSubStepTwo(),
    ComposeBasicsSubStepThree(),
    ComposeBasicsSubStepFour(),
    ComposeBasicsSubStepFive(),
    ComposeBasicsSubStepSix(),
    ComposeBasicsSubStepSeven(),
    ComposeBasicsSubStepEight(),
    ComposeBasicsSubStepNine(),
    ComposeBasicsSubStepTen(),
    ComposeBasicsSubStepEleven(),
    ComposeBasicsSubStepTwelve(),
    ComposeBasicsSubStepThirteen(),
    // ComposeBasicsSubStepFourteen(),
    ComposeBasicsSubStepFifteen(),
    ComposeBasicsSubStepSixteen(),
    ComposeBasicsSubStepEighteen(),
    ComposeBasicsSubStepNineteen(),
  )
}