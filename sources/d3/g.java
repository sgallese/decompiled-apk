package d3;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: f  reason: collision with root package name */
    private final EditText f13115f;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f13116m;

    /* renamed from: p  reason: collision with root package name */
    private f.AbstractC0088f f13117p;

    /* renamed from: q  reason: collision with root package name */
    private int f13118q = Integer.MAX_VALUE;

    /* renamed from: r  reason: collision with root package name */
    private int f13119r = 0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13120s = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmojiTextWatcher.java */
    /* loaded from: classes.dex */
    public static class a extends f.AbstractC0088f implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final Reference<EditText> f13121f;

        a(EditText editText) {
            this.f13121f = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0088f
        public void b() {
            Handler handler;
            super.b();
            EditText editText = this.f13121f.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            g.c(this.f13121f.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(EditText editText, boolean z10) {
        this.f13115f = editText;
        this.f13116m = z10;
    }

    static void c(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().r(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean e() {
        if (this.f13120s && (this.f13116m || androidx.emoji2.text.f.k())) {
            return false;
        }
        return true;
    }

    f.AbstractC0088f a() {
        if (this.f13117p == null) {
            this.f13117p = new a(this.f13115f);
        }
        return this.f13117p;
    }

    public boolean b() {
        return this.f13120s;
    }

    public void d(boolean z10) {
        if (this.f13120s != z10) {
            if (this.f13117p != null) {
                androidx.emoji2.text.f.c().w(this.f13117p);
            }
            this.f13120s = z10;
            if (z10) {
                c(this.f13115f, androidx.emoji2.text.f.c().g());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f13115f.isInEditMode() && !e() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int g10 = androidx.emoji2.text.f.c().g();
            if (g10 != 0) {
                if (g10 != 1) {
                    if (g10 != 3) {
                        return;
                    }
                } else {
                    androidx.emoji2.text.f.c().u((Spannable) charSequence, i10, i10 + i12, this.f13118q, this.f13119r);
                    return;
                }
            }
            androidx.emoji2.text.f.c().v(a());
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
