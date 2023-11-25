package d3;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f13104a;

    /* renamed from: b  reason: collision with root package name */
    private f.AbstractC0088f f13105b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmojiInputFilter.java */
    /* loaded from: classes.dex */
    public static class a extends f.AbstractC0088f implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final Reference<TextView> f13106f;

        /* renamed from: m  reason: collision with root package name */
        private final Reference<d> f13107m;

        a(TextView textView, d dVar) {
            this.f13106f = new WeakReference(textView);
            this.f13107m = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.f.AbstractC0088f
        public void b() {
            Handler handler;
            super.b();
            TextView textView = this.f13106f.get();
            if (textView != null && (handler = textView.getHandler()) != null) {
                handler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence r10;
            TextView textView = this.f13106f.get();
            if (!c(textView, this.f13107m.get()) || !textView.isAttachedToWindow() || text == (r10 = androidx.emoji2.text.f.c().r((text = textView.getText())))) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(r10);
            int selectionEnd = Selection.getSelectionEnd(r10);
            textView.setText(r10);
            if (r10 instanceof Spannable) {
                d.b((Spannable) r10, selectionStart, selectionEnd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(TextView textView) {
        this.f13104a = textView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    f.AbstractC0088f a() {
        if (this.f13105b == null) {
            this.f13105b = new a(this.f13104a, this);
        }
        return this.f13105b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f13104a.isInEditMode()) {
            return charSequence;
        }
        int g10 = androidx.emoji2.text.f.c().g();
        if (g10 != 0) {
            boolean z10 = true;
            if (g10 != 1) {
                if (g10 != 3) {
                    return charSequence;
                }
            } else {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f13104a.getText()) {
                    z10 = false;
                }
                if (z10 && charSequence != null) {
                    if (i10 != 0 || i11 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i10, i11);
                    }
                    return androidx.emoji2.text.f.c().s(charSequence, 0, charSequence.length());
                }
                return charSequence;
            }
        }
        androidx.emoji2.text.f.c().v(a());
        return charSequence;
    }
}
