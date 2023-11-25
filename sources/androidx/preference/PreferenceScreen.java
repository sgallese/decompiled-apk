package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.k;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: v  reason: collision with root package name */
    private boolean f6242v;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.res.l.a(context, n.f6349g, 16842891));
        this.f6242v = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceGroup
    public boolean l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void onClick() {
        k.b g10;
        if (getIntent() == null && getFragment() == null && k() != 0 && (g10 = getPreferenceManager().g()) != null) {
            g10.onNavigateToScreen(this);
        }
    }

    public boolean s() {
        return this.f6242v;
    }
}
