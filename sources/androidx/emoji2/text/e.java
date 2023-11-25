package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.emoji2.text.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultGlyphChecker.java */
/* loaded from: classes.dex */
public class e implements f.e {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f4365b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f4366a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        TextPaint textPaint = new TextPaint();
        this.f4366a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f4365b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 23 && i12 > i13) {
            return false;
        }
        StringBuilder b10 = b();
        b10.setLength(0);
        while (i10 < i11) {
            b10.append(charSequence.charAt(i10));
            i10++;
        }
        return androidx.core.graphics.c.a(this.f4366a, b10.toString());
    }
}
