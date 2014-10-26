package heroesgrave.paint.image.change.edit;

import heroesgrave.paint.image.RawImage;
import heroesgrave.paint.image.change.IImageChange;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class InvertChange extends IImageChange
{
	@Override
	public void write(DataOutputStream out) throws IOException
	{
	}
	
	@Override
	public void read(DataInputStream in) throws IOException
	{
	}
	
	@Override
	public RawImage apply(RawImage image)
	{
		int[] buffer = image.getBuffer();
		boolean[] mask = image.getMask();
		
		for(int i = 0; i < buffer.length; i++)
		{
			if(mask == null || mask[i])
				buffer[i] ^= 0x00FFFFFF; // I hope this is correct.
		}
		
		return image;
	}
}