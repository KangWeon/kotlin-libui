[libui.ktx](../index.md) / [Separator](./index.md)

# Separator

`abstract class Separator : `[`Control`](../-control/index.md)`<`[`uiSeparator`](../../libui/ui-separator.md)`>`

Wrapper class for [uiSeparator](../../libui/ui-separator.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Separator(alloc: CPointer<`[`uiSeparator`](../../libui/ui-separator.md)`>?)`<br>Wrapper class for [uiSeparator](../../libui/ui-separator.md) |

### Inherited Properties

| Name | Summary |
|---|---|
| [enabled](../-control/enabled.md) | `var enabled: Boolean`<br>Whether the Control should be enabled or disabled. Defaults to `true`. |
| [parent](../-control/parent.md) | `var parent: `[`Control`](../-control/index.md)`<*>?`<br>Returns parent of the control or `null` for detached. |
| [toplevel](../-control/toplevel.md) | `val toplevel: Boolean`<br>Returns whether the control is a top level one or not. |
| [visible](../-control/visible.md) | `var visible: Boolean`<br>Whether the Control should be visible or hidden. Defaults to `true`. |

### Inherited Functions

| Name | Summary |
|---|---|
| [disable](../-control/disable.md) | `fun disable(): Unit`<br>Disables the Control. |
| [dispose](../-control/dispose.md) | `open fun dispose(): Unit`<br>Dispose and free all allocated resources. |
| [enable](../-control/enable.md) | `fun enable(): Unit`<br>Enables the Control. |
| [getHandle](../-control/get-handle.md) | `fun getHandle(): ULong`<br>Returns the OS-level handle associated with this Control. |
| [hide](../-control/hide.md) | `fun hide(): Unit`<br>Hides the Control. Hidden controls do not participate in layout (that is, Box, GridPane, etc. does not reserve space for hidden controls). |
| [isEnabled](../-control/is-enabled.md) | `fun isEnabled(): Boolean`<br>Whether the Control is enabled. |
| [isEnabledToUser](../-control/is-enabled-to-user.md) | `fun isEnabledToUser(): Boolean`<br>Whether the Control and all parents are enabled. |
| [isVisible](../-control/is-visible.md) | `fun isVisible(): Boolean`<br>Whether the Control is visible. |
| [show](../-control/show.md) | `fun show(): Unit`<br>Shows the Control. |

### Inheritors

| Name | Summary |
|---|---|
| [HorizontalSeparator](../-horizontal-separator/index.md) | `class HorizontalSeparator : `[`Separator`](./index.md)<br>Wrapper class for [uiSeparator](../../libui/ui-separator.md) - an horizontal line to visually separate widgets. |
| [VerticalSeparator](../-vertical-separator/index.md) | `class VerticalSeparator : `[`Separator`](./index.md)<br>Wrapper class for [uiSeparator](../../libui/ui-separator.md) - a vertical line to visually separate widgets. |
