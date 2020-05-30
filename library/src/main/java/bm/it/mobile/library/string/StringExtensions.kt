package bm.it.mobile.library.string

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.core.graphics.drawable.RoundedBitmapDrawable

fun String.convertImagePathToBitmap(): Bitmap = StringExtensionsImpl.convertImagePathToBitmap(this)

fun String.convertBase64ToBitmap(): Bitmap = StringExtensionsImpl.convertBase64ToBitmap(this)

fun String.convertImageDrawableNameToDrawable(context: Context): Drawable? =
    StringExtensionsImpl.convertImageDrawableNameToDrawable(context, this)

fun String.convertImageFileNameToRoundedImage(context: Context): RoundedBitmapDrawable? =
    StringExtensionsImpl.convertImageFileNameToRoundedImage(context, this)

fun String.convertBase64ToRoundedBitmap(context: Context): RoundedBitmapDrawable? =
    StringExtensionsImpl.convertBase64ToRoundedBitmap(context, this)

fun String.convertBase64ToByteArray(): ByteArray =
    StringExtensionsImpl.convertBase64ToByteArray(this)

fun String.convertImagePathToResizeImage(): Bitmap =
    StringExtensionsImpl.convertImagePathToResizeImage(this)

fun String.convertImagePathToBase64(): String = StringExtensionsImpl.convertImagePathToBase64(this)

fun String.rotateImageFromImagePath(): Bitmap = StringExtensionsImpl.rotateImageFromImagePath(this)

fun String.convertFilePathToDigestSHA256(): String =
    StringExtensionsImpl.convertFilePathToDigestSHA256(this)