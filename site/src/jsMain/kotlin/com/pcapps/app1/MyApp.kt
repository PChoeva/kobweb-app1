package com.pcapps.app1

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.MutableSilkTheme
import com.varabyte.kobweb.silk.theme.colors.palette.*
import org.jetbrains.compose.web.css.*

@InitSilk
fun updateTheme(ctx: InitSilkContext) {
    val mutableTheme = ctx.theme

    //new version
    mutableTheme.palettes.apply {
        //light
        light.background = Colors.White
        light.color = Colors.Black
        light.apply {
            light.link.set(
                default = Colors.Black,
                visited = Colors.Blue
            )
            light.button.set(
                default = Colors.DarkGray,
                hover = Colors.LightGray,
                focus = Colors.LightGray,
                pressed = Colors.Gray
            )

            //dark
            dark.background = Colors.Black
            dark.color = Colors.White
            dark.link.set(
                default = Colors.White,
                visited = Colors.Blue
            )
            dark.button.set(
                default = Colors.Blue,
                hover = Colors.MediumBlue,
                focus = Colors.MediumBlue,
                pressed = Colors.DarkBlue
            )
        }
    }

    //old version
//    ctx.theme.palettes = MutableSilkPalettes(
//        light = MutableSilkPalette(
//            background = Colors.White,
//            color = Colors.Black,
//            link = MutableSilkPalette.link(
//                default = Colors.Black,
//                visited = Colors.Blue
//            ),
//            button = MutableSilkPalette.Button(
//                default = Colors.DarkGray,
//                hover = Colors.LightGray,
//                focus = Colors.LightGray,
//                pressed = Colors.Gray
//            )
//        ),
//        dark = MutableSilkPalette(
//            background = Colors.Black,
//            color = Colors.White,
//            link = MutableSilkPalette.link(
//                default = Colors.White,
//                visited = Colors.Blue
//            ),
//            button = MutableSilkPalette.Button(
//                default = Colors.DarkGray,
//                hover = Colors.MediumBlue,
//                focus = Colors.MediumBlue,
//                pressed = Colors.DarkBlue
//            )
//        )
//    )
}
@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
