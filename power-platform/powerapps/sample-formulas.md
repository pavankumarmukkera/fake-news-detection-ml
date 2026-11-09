# Power Fx Learning Examples

These are illustrative formulas, not exported app code.
Controls and data sources must be configured before use.

## Navigate to another screen

```powerfx
Navigate(scrDetails, ScreenTransition.Fade)
```

## Validate a text input

```powerfx
If(
    IsBlank(Trim(txtName.Text)),
    Notify("Name is required", NotificationType.Error),
    Notify("Input accepted", NotificationType.Success)
)
```

## Filter a gallery

```powerfx
Filter(
    ProjectRecords,
    StartsWith(Title, txtSearch.Text)
)
```

## Integration status

These examples are not yet connected to this project's
data model. Names such as ProjectRecords are placeholders.
