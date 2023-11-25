package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: f  reason: collision with root package name */
    private final Context f6216f;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayAdapter f6217m;

    /* renamed from: p  reason: collision with root package name */
    private Spinner f6218p;

    /* renamed from: q  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f6219q;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.f6345c);
    }

    private int d(String str) {
        CharSequence[] entryValues = getEntryValues();
        if (str != null && entryValues != null) {
            for (int length = entryValues.length - 1; length >= 0; length--) {
                if (TextUtils.equals(entryValues[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    private void f() {
        this.f6217m.clear();
        if (getEntries() != null) {
            for (CharSequence charSequence : getEntries()) {
                this.f6217m.add(charSequence.toString());
            }
        }
    }

    protected ArrayAdapter b() {
        return new ArrayAdapter(this.f6216f, 17367049);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void notifyChanged() {
        super.notifyChanged();
        ArrayAdapter arrayAdapter = this.f6217m;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(m mVar) {
        Spinner spinner = (Spinner) mVar.itemView.findViewById(p.f6360e);
        this.f6218p = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f6217m);
        this.f6218p.setOnItemSelectedListener(this.f6219q);
        this.f6218p.setSelection(d(getValue()));
        super.onBindViewHolder(mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void onClick() {
        this.f6218p.performClick();
    }

    @Override // androidx.preference.ListPreference
    public void setEntries(CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        f();
    }

    @Override // androidx.preference.ListPreference
    public void setValueIndex(int i10) {
        setValue(getEntryValues()[i10].toString());
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6219q = new a();
        this.f6216f = context;
        this.f6217m = b();
        f();
    }

    /* loaded from: classes.dex */
    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String charSequence = DropDownPreference.this.getEntryValues()[i10].toString();
                if (!charSequence.equals(DropDownPreference.this.getValue()) && DropDownPreference.this.callChangeListener(charSequence)) {
                    DropDownPreference.this.setValue(charSequence);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
