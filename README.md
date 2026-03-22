# Counter App (Jetpack Compose)

## Overview
This app implements a simple counter screen using Jetpack Compose. The screen displays a number starting at 0 and provides two buttons to increment or reset the count. The UI updates automatically whenever the state changes.

## Features
- Displays a counter starting at 0  
- "Increment" button increases the count by 1  
- "Reset" button sets the count back to 0  
- UI updates automatically using Compose recomposition  
- Counter value is preserved during screen rotation  

## Implementation Details
The counter state is managed using:
- `mutableStateOf` to create an observable state  
- `rememberSaveable` to persist state across recompositions and configuration changes (e.g., screen rotation)

Whenever the value of the counter changes, Jetpack Compose triggers recomposition and updates the UI accordingly.

## How to Run
1. Open the project in Android Studio  
2. Run the app on an emulator or physical device  
3. Interact with the buttons to update the counter  

## AI Usage Disclosure
ChatGPT was used to:
- Assist in writing and refining the README documentation  
- Provide conceptual guidance on Jetpack Compose state management  
- Help refine and verify the implementation
