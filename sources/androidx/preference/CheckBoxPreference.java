package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: s  reason: collision with root package name */
    private final a f6214s;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!CheckBoxPreference.this.callChangeListener(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                CheckBoxPreference.this.d(z10);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    private void l(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f6268f);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f6214s);
        }
    }

    private void m(View view) {
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        l(view.findViewById(16908289));
        j(view.findViewById(16908304));
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(m mVar) {
        super.onBindViewHolder(mVar);
        l(mVar.a(16908289));
        k(mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void performClick(View view) {
        super.performClick(view);
        m(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6214s = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f6378c, i10, i11);
        i(androidx.core.content.res.l.o(obtainStyledAttributes, t.f6396i, t.f6381d));
        g(androidx.core.content.res.l.o(obtainStyledAttributes, t.f6393h, t.f6384e));
        f(androidx.core.content.res.l.b(obtainStyledAttributes, t.f6390g, t.f6387f, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.l.a(context, n.f6343a, 16842895));
    }

    public CheckBoxPreference(Context context) {
        this(context, null);
    }
}
