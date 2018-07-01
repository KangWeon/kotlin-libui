import libui.*

fun Window.basicControlsPage() = VerticalBox().apply {
    padded = true
    hbox {
        button("Button")
        checkbox("Checkbox")
    }
    label("This is a label. Right now, labels can only span one line.")
    separator()
    group("Entries", stretchy = true) {
        form {
            textfield("Text Field")
            passwordfield("Password Field")
            searchfield("Search Field")
            textarea("Multiline Field", stretchy = true)
            textarea("Multiline Field No Wrap", wrap = false, stretchy = true)
        }
    }
}

fun Window.numbersPage() = HorizontalBox().apply {
    padded = true
    group("Numbers", stretchy = true) {
        vbox {
            val spinbox = spinbox(min = 0, max = 100)
            val slider = slider(min = 0, max = 100)
            val pbar = progressbar()
            spinbox.action {
                slider.value = value
                pbar.value = value
            }
            slider.action {
                spinbox.value = value
                pbar.value = value
            }
            progressbar { value = -1 }
        }
    }
    group("Lists", stretchy = true) {
        vbox {
            combobox {
                item("Combobox Item 1")
                item("Combobox Item 2")
                item("Combobox Item 3")
            }
            editablecombobox {
                item("Editable Item 1")
                item("Editable Item 2")
                item("Editable Item 3")
            }
            radiobuttons {
                item("Radio Button 1")
                item("Radio Button 2")
                item("Radio Button 3")
            }
        }
    }
}

fun Window.dataChoosersPage() = HorizontalBox().apply {
    padded = true
    vbox {
        datepicker()
        timepicker()
        datetimepicker()
        fontbutton()
        colorbutton()
    }
    separator()
    vbox(stretchy = true) {
        add(widget = Grid().apply {
            padded = true

            val entry1 = TextField().apply { readonly = true }
            val button1 = Button("Open File").apply {
                action {
                    entry1.value = OpenFileDialog() ?: "(cancelled)"
                }
            }
            add(widget = button1, y = 0, x = 0)
            add(widget = entry1, y = 0, x = 1, hexpand = true)

            val entry2 = TextField().apply { readonly = true }
            val button2 = Button("Save File").apply {
                action {
                    entry2.value = SaveFileDialog() ?: "(cancelled)"
                }
            }
            add(widget = button2, y = 1, x = 0)
            add(widget = entry2, y = 1, x = 1, hexpand = true)

            add(y = 2, xspan = 2, widget = Grid().apply {
                padded = true
                add(x = 0, widget = Button("Message Box").apply {
                    action {
                        MsgBox(text = "This is a normal message box.",
                            details = "More detailed information can be shown here.")
                    }
                })
                add(x = 1, widget = Button("Error Box").apply {
                    action {
                        MsgBoxError(text = "This message box describes an error.",
                            details = "More detailed information can be shown here.")
                    }
                })
            })
        })
    }
}

fun main(args: Array<String>) = appWindow(
    title = "libui Control Gallery",
    width = 640,
    height = 480
) {
    add(widget = Tab().apply {
        add(label = "Basic Controls",
            widget = basicControlsPage())

        add(label = "Numbers and Lists",
            widget = numbersPage())

        add(label = "Data Choosers",
            widget = dataChoosersPage())
    })
}
