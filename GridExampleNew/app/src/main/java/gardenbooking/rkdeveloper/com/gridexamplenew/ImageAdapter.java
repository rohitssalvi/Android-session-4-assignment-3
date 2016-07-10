package gardenbooking.rkdeveloper.com.gridexamplenew;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by ROHIT on 7/10/2016.
 */
public class ImageAdapter extends BaseAdapter {

    Context context;
    private Integer[] im={R.drawable.gingerdroid,
            R.drawable.honeycomb,
            R.drawable.icecreamsandwitch,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lolipop

    };

    public ImageAdapter(Context c)
    {
        context=c;
    }
    @Override
    public int getCount() {
        return im.length;
    }

    @Override
    public Object getItem(int position) {
        return im[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageview;
        if(convertView==null)
        {
            imageview=new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(250, 250));
            imageview.setScaleType(ImageView.ScaleType.FIT_XY);

        }
        else {
            imageview=(ImageView)convertView;
        }

        imageview.setImageResource(im[position]);
        return imageview;
    }



}
