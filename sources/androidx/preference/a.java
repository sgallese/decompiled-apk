package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: EditTextPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class a extends g {

    /* renamed from: f  reason: collision with root package name */
    private EditText f6274f;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f6275m;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f6276p = new RunnableC0149a();

    /* renamed from: q  reason: collision with root package name */
    private long f6277q = -1;

    /* compiled from: EditTextPreferenceDialogFragmentCompat.java */
    /* renamed from: androidx.preference.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0149a implements Runnable {
        RunnableC0149a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.e();
        }
    }

    private EditTextPreference b() {
        return (EditTextPreference) getPreference();
    }

    private boolean c() {
        long j10 = this.f6277q;
        if (j10 != -1 && j10 + 1000 > SystemClock.currentThreadTimeMillis()) {
            return true;
        }
        return false;
    }

    public static a d(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    private void f(boolean z10) {
        long j10;
        if (z10) {
            j10 = SystemClock.currentThreadTimeMillis();
        } else {
            j10 = -1;
        }
        this.f6277q = j10;
    }

    void e() {
        if (c()) {
            EditText editText = this.f6274f;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.f6274f.getContext().getSystemService("input_method")).showSoftInput(this.f6274f, 0)) {
                    f(false);
                    return;
                }
                this.f6274f.removeCallbacks(this.f6276p);
                this.f6274f.postDelayed(this.f6276p, 50L);
                return;
            }
            f(false);
        }
    }

    @Override // androidx.preference.g
    protected boolean needInputMethod() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.g
    public void onBindDialogView(View view) {
        super.onBindDialogView(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f6274f = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f6274f.setText(this.f6275m);
            EditText editText2 = this.f6274f;
            editText2.setSelection(editText2.getText().length());
            b().b();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.g, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f6275m = b().getText();
        } else {
            this.f6275m = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.g
    public void onDialogClosed(boolean z10) {
        if (z10) {
            String obj = this.f6274f.getText().toString();
            EditTextPreference b10 = b();
            if (b10.callChangeListener(obj)) {
                b10.setText(obj);
            }
        }
    }

    @Override // androidx.preference.g, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f6275m);
    }

    @Override // androidx.preference.g
    protected void scheduleShowSoftInput() {
        f(true);
        e();
    }
}
