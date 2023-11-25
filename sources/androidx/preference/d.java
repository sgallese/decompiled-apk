package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class d extends g {

    /* renamed from: f  reason: collision with root package name */
    Set<String> f6284f = new HashSet();

    /* renamed from: m  reason: collision with root package name */
    boolean f6285m;

    /* renamed from: p  reason: collision with root package name */
    CharSequence[] f6286p;

    /* renamed from: q  reason: collision with root package name */
    CharSequence[] f6287q;

    /* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
    /* loaded from: classes.dex */
    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
            if (z10) {
                d dVar = d.this;
                dVar.f6285m = dVar.f6284f.add(dVar.f6287q[i10].toString()) | dVar.f6285m;
                return;
            }
            d dVar2 = d.this;
            dVar2.f6285m = dVar2.f6284f.remove(dVar2.f6287q[i10].toString()) | dVar2.f6285m;
        }
    }

    private MultiSelectListPreference b() {
        return (MultiSelectListPreference) getPreference();
    }

    public static d c(String str) {
        d dVar = new d();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // androidx.preference.g, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference b10 = b();
            if (b10.getEntries() != null && b10.getEntryValues() != null) {
                this.f6284f.clear();
                this.f6284f.addAll(b10.b());
                this.f6285m = false;
                this.f6286p = b10.getEntries();
                this.f6287q = b10.getEntryValues();
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f6284f.clear();
        this.f6284f.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f6285m = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f6286p = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f6287q = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // androidx.preference.g
    public void onDialogClosed(boolean z10) {
        if (z10 && this.f6285m) {
            MultiSelectListPreference b10 = b();
            if (b10.callChangeListener(this.f6284f)) {
                b10.d(this.f6284f);
            }
        }
        this.f6285m = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.g
    public void onPrepareDialogBuilder(c.a aVar) {
        super.onPrepareDialogBuilder(aVar);
        int length = this.f6287q.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f6284f.contains(this.f6287q[i10].toString());
        }
        aVar.g(this.f6286p, zArr, new a());
    }

    @Override // androidx.preference.g, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f6284f));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f6285m);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f6286p);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f6287q);
    }
}
