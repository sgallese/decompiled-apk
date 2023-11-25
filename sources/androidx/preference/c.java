package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.c;

/* compiled from: ListPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class c extends g {

    /* renamed from: f  reason: collision with root package name */
    int f6280f;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence[] f6281m;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence[] f6282p;

    /* compiled from: ListPreferenceDialogFragmentCompat.java */
    /* loaded from: classes.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            c cVar = c.this;
            cVar.f6280f = i10;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference b() {
        return (ListPreference) getPreference();
    }

    public static c c(String str) {
        c cVar = new c();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // androidx.preference.g, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference b10 = b();
            if (b10.getEntries() != null && b10.getEntryValues() != null) {
                this.f6280f = b10.findIndexOfValue(b10.getValue());
                this.f6281m = b10.getEntries();
                this.f6282p = b10.getEntryValues();
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f6280f = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f6281m = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f6282p = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.g
    public void onDialogClosed(boolean z10) {
        int i10;
        if (z10 && (i10 = this.f6280f) >= 0) {
            String charSequence = this.f6282p[i10].toString();
            ListPreference b10 = b();
            if (b10.callChangeListener(charSequence)) {
                b10.setValue(charSequence);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.g
    public void onPrepareDialogBuilder(c.a aVar) {
        super.onPrepareDialogBuilder(aVar);
        aVar.l(this.f6281m, this.f6280f, new a());
        aVar.j(null, null);
    }

    @Override // androidx.preference.g, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f6280f);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f6281m);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f6282p);
    }
}
