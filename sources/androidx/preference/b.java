package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandButton.java */
/* loaded from: classes.dex */
final class b extends Preference {

    /* renamed from: f  reason: collision with root package name */
    private long f6279f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, List<Preference> list, long j10) {
        super(context);
        b();
        d(list);
        this.f6279f = j10 + 1000000;
    }

    private void b() {
        setLayoutResource(q.f6362a);
        setIcon(o.f6355a);
        setTitle(r.f6367b);
        setOrder(999);
    }

    private void d(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference preference : list) {
            CharSequence title = preference.getTitle();
            boolean z10 = preference instanceof PreferenceGroup;
            if (z10 && !TextUtils.isEmpty(title)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.getParent())) {
                if (z10) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(title)) {
                if (charSequence == null) {
                    charSequence = title;
                } else {
                    charSequence = getContext().getString(r.f6370e, charSequence, title);
                }
            }
        }
        setSummary(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.preference.Preference
    public long getId() {
        return this.f6279f;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(m mVar) {
        super.onBindViewHolder(mVar);
        mVar.e(false);
    }
}
