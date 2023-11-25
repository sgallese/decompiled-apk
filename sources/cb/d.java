package cb;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

/* compiled from: LinkResolverDef.java */
/* loaded from: classes4.dex */
public class d implements c {
    private static Uri b(String str) {
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return parse.buildUpon().scheme("https").build();
        }
        return parse;
    }

    @Override // cb.c
    public void a(View view, String str) {
        Uri b10 = b(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", b10);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }
}
