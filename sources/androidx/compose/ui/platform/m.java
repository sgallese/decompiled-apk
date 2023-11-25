package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;

/* compiled from: AndroidClipboardManager.android.kt */
/* loaded from: classes.dex */
public final class m implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final ClipboardManager f2749a;

    public m(ClipboardManager clipboardManager) {
        qc.q.i(clipboardManager, "clipboardManager");
        this.f2749a = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.x0
    public boolean a() {
        ClipDescription primaryClipDescription = this.f2749a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.x0
    public void b(v1.d dVar) {
        qc.q.i(dVar, "annotatedString");
        this.f2749a.setPrimaryClip(ClipData.newPlainText("plain text", n.b(dVar)));
    }

    @Override // androidx.compose.ui.platform.x0
    public v1.d getText() {
        ClipData primaryClip = this.f2749a.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return n.a(charSequence);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            qc.q.i(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            qc.q.g(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.m.<init>(android.content.Context):void");
    }
}
