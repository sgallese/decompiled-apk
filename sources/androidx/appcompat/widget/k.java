package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f1546a;

    /* renamed from: b  reason: collision with root package name */
    private final d3.a f1547b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(EditText editText) {
        this.f1546a = editText;
        this.f1547b = new d3.a(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        if (b(keyListener)) {
            return this.f1547b.a(keyListener);
        }
        return keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f1547b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1546a.getContext().obtainStyledAttributes(attributeSet, g.j.f15865g0, i10, 0);
        try {
            int i11 = g.j.f15935u0;
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z10 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            f(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputConnection e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1547b.c(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z10) {
        this.f1547b.d(z10);
    }
}
