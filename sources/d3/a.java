package d3;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.i;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f13094a;

    /* renamed from: b  reason: collision with root package name */
    private int f13095b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private int f13096c = 0;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: d3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0301a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f13097a;

        /* renamed from: b  reason: collision with root package name */
        private final g f13098b;

        C0301a(EditText editText, boolean z10) {
            this.f13097a = editText;
            g gVar = new g(editText, z10);
            this.f13098b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(d3.b.getInstance());
        }

        @Override // d3.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new e(keyListener);
        }

        @Override // d3.a.b
        boolean b() {
            return this.f13098b.b();
        }

        @Override // d3.a.b
        InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof c) {
                return inputConnection;
            }
            return new c(this.f13097a, inputConnection, editorInfo);
        }

        @Override // d3.a.b
        void d(boolean z10) {
            this.f13098b.d(z10);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        boolean b() {
            throw null;
        }

        InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        void d(boolean z10) {
            throw null;
        }
    }

    public a(EditText editText, boolean z10) {
        i.h(editText, "editText cannot be null");
        this.f13094a = new C0301a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f13094a.a(keyListener);
    }

    public boolean b() {
        return this.f13094a.b();
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f13094a.c(inputConnection, editorInfo);
    }

    public void d(boolean z10) {
        this.f13094a.d(z10);
    }
}
