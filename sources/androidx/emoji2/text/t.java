package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
public class t implements Spannable {

    /* renamed from: f  reason: collision with root package name */
    private boolean f4459f = false;

    /* renamed from: m  reason: collision with root package name */
    private Spannable f4460m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class a {
        static IntStream a(CharSequence charSequence) {
            IntStream convert;
            convert = IntStream.VivifiedWrapper.convert(charSequence.chars());
            return convert;
        }

        static IntStream b(CharSequence charSequence) {
            IntStream convert;
            convert = IntStream.VivifiedWrapper.convert(charSequence.codePoints());
            return convert;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.t.b
        boolean a(CharSequence charSequence) {
            if (!androidx.core.text.d.a(charSequence) && !(charSequence instanceof androidx.core.text.t)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Spannable spannable) {
        this.f4460m = spannable;
    }

    private void a() {
        Spannable spannable = this.f4460m;
        if (!this.f4459f && c().a(spannable)) {
            this.f4460m = new SpannableString(spannable);
        }
        this.f4459f = true;
    }

    static b c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new b();
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Spannable b() {
        return this.f4460m;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f4460m.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f4460m.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f4460m.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f4460m.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f4460m.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f4460m.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f4460m.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f4460m.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f4460m.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f4460m.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f4460m.toString();
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f4460m);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f4460m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(CharSequence charSequence) {
        this.f4460m = new SpannableString(charSequence);
    }
}
