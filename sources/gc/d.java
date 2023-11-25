package gc;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ComparisonsJvm.kt */
/* loaded from: classes4.dex */
public class d extends c {
    public static float g(float f10, float... fArr) {
        q.i(fArr, TaskSetupFragment.TYPE_OTHER);
        for (float f11 : fArr) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    public static float h(float f10, float... fArr) {
        q.i(fArr, TaskSetupFragment.TYPE_OTHER);
        for (float f11 : fArr) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }
}
