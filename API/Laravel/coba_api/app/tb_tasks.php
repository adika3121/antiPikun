<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class tb_tasks extends Model
{
    protected $primaryKey ='id_task';

    protected $fillable = [
        'id_user', 'nama_task', 'deskripsi', 'tanggal_deadline', 'waktu_deadline', 'repeat', 'repeat_type', 'repeat_number', 'active'
    ];

    public function user(){
      return $this->belongsTo('App\User','id');
    }
}
