package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: classes.dex */
public final class q extends j {

    /* renamed from: t  reason: collision with root package name */
    private static Paint f4457t;

    /* renamed from: s  reason: collision with root package name */
    private TextPaint f4458s;

    public q(p pVar) {
        super(pVar);
    }

    private TextPaint c(CharSequence charSequence, int i10, int i11, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint = this.f4458s;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.f4458s = textPaint;
                    }
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                    return textPaint;
                }
            }
            if (!(paint instanceof TextPaint)) {
                return null;
            }
            return (TextPaint) paint;
        } else if (!(paint instanceof TextPaint)) {
            return null;
        } else {
            return (TextPaint) paint;
        }
    }

    private static Paint e() {
        if (f4457t == null) {
            TextPaint textPaint = new TextPaint();
            f4457t = textPaint;
            textPaint.setColor(f.c().e());
            f4457t.setStyle(Paint.Style.FILL);
        }
        return f4457t;
    }

    void d(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        TextPaint c10 = c(charSequence, i10, i11, paint2);
        if (c10 != null && c10.bgColor != 0) {
            d(canvas, c10, f10, f10 + b(), i12, i14);
        }
        if (f.c().l()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, e());
        }
        p a10 = a();
        float f11 = i13;
        if (c10 != null) {
            paint2 = c10;
        }
        a10.a(canvas, f10, f11, paint2);
    }
}
